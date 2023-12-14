#!/bin/bash

# Copy these functions into your script :)

SLB::set_total_perc(){
  SLB_TOTAL_PERC=$1
}

SLB::update_curr_status() {
  SLB_CURR_STATUS=$1
}

SLB::get_perc(){
  echo "100*$SLB_CURR_STATUS/$SLB_TOTAL_PERC" | bc
}

SLB::show_loading_bar(){
  printf "["
  perc=$(SLB::get_perc)
  for i in {1..50}; do
    if [[ $i -lt $((perc / 2)) || $i -eq $((perc / 2)) ]]; then
      printf "="
    else
      printf " "
    fi
  done 
  printf "] %3.0f%%\r" "$perc"
}
