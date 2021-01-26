#!/bin/sh

##
curl -sL https://raw.githubusercontent.com/zhaosair/cg-master/master/Docker/docker-compose.yml -o docker-compose.yml

mkdir config
curl -sL https://raw.githubusercontent.com/zhaosair/cg-master/master/Docker/config/application-test.yml -o ./config/application-test.yml


if [ ! -f ./docker-compose.yml ];then
  echo docker-compose.yml download fail!
  exit
fi  

if [ ! -f ./config/application-test.yml ];then
  echo application-test.yml download fail!
  exit
fi

docker-compose up $@
