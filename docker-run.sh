#!/bin/sh

##
curl -sL https://raw.githubusercontent.com/zhaosair/cg-master/master/docker-compose.yml -o docker-compose.yml

if [ ! -f ./docker-compose.yml ];then
  echo docker-compose.yml download fail!
  exit
fi  

docker-compose up $@
