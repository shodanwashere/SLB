# SLB
Shodan's Loading Bar. Based on the one present in STrafAn.

![Pipeline](https://github.com/shodanwashere/slb/actions/workflows/pipeline.yml/badge.svg)
[![HitCount](https://hits.dwyl.com/shodanwashere/slb.svg)](https://hits.dwyl.com/shodanwashere/slb)
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

Bash:
To use the functions in the Bash version, copy them over to your script beforehand.
```sh
status=0
SLB::set_total_perc 100
for i in {1..100}; do
  status=$i
  SLB::update_curr_status $status
  SLB::show_loading_bar
done
```

ANSI-C:
```c
#include "loading_bar.h"

LoadingBar lb;
int nr_ops = 100;
lb_init_loadbar(&lb, nr_ops);
for(int status = 0; status < nr_ops; status++){
  lb_update_curr_status(&lb, status);
  lb_show_loading_bar(&lb);
}
```
