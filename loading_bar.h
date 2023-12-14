#ifndef SLB_HEADER_FILE
#define SLB_HEADER_FILE

#include <stdio.h>

typedef struct {
  int total_perc;
  int curr_status;
} LoadingBar;

void lb_init_loadbar(LoadingBar *lb, int total){
  lb->total_perc  = total;
  lb->curr_status = 0;
}

void lb_update_curr_status(LoadingBar *lb, int new_status){
  lb->curr_status = new_status;
}

float lb_get_perc(LoadingBar *lb){
  float perc = 100 * lb->curr_status / lb->total_perc;
  return perc;
}

void lb_show_loading_bar(LoadingBar *lb){
  printf("[");
  float perc = lb_get_perc(lb);
  for(int i = 0; i < 10; i++){
    char bar;
    if(i < perc) bar = '=';
    else bar = ' ';
    printf("%c", bar);
  }
  printf("] %f\r", perc);
}

#endif
