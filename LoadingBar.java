public class LoadingBar {
  private int total_perc; // loads the number that should be equal to 100%
  private int curr_status; // loads a current number. assuming it's under total_perc
  
  public LoadingBar(int total){
    this.total_perc = total;
    this.curr_status = 0;
  }

  public void update_curr_status(int new_status){
    this.curr_status = new_status;
  }

  public float get_perc(){
    return ((float)curr_status/(float)total_perc)*100;
  }

  public void show_loading_bar(){
    System.out.print("[");
    for(int j = 1; j <= 3; j++){
      if (j < (get_perc() / 10))
        System.out.print("=");
      else
        System.out.print(" ");
    }
    String perc = new String(get_perc().toString()+"%");
    System.out.print(perc);
    for(int j = 3+perc.length(); j <= 10; j++){
      if(j < (get_perc() / 10))
        System.out.print("=");
      else
        System.out.print(" ");
    }
    System.out.print("]\r");
  }
}
