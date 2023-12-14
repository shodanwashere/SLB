# SLB
Shodan's Loading Bar. Based on the one present in STrafAn.

![Pipeline](https://github.com/shodanwashere/slb/actions/workflows/pipeline.yml/badge.svg)
## Example of usage
Java:
```java
int nrOps = 500;
LoadingBar opsLB = new LoadingBar(nrOps);
System.out.println("Beginning operations...");
for(int i = 0; i < nrOps; i++){
  // insert operation here
  opsLB.update_curr_status(i);
  opsLB.show_loading_bar();
}
```

Python:
```py
nr_ops = 500
ops_lb = LoadingBar(nr_ops)
for i in range(0, nrOps):
  // insert operation here
  ops_lb.update_curr_status(i)
  ops_lb.show_loading_bar()
```
