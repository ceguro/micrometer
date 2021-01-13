# micrometer
Spring's Project with Micrometer, Prometheus and Grafana

You must download Prometheus and Grafana - to local tests you can use dockers like these:

- docker pull prom/prometheus
- docker pull grafana/grafana 

Ypu can run those docker like these:

- docker run -d --name prometheus -p 9090:9090 prom/prometheus
- docker run -d --name grafana --link prometheus -p 3000:3000 grafana/grafana

Notice: check with "docker network inspect bridg" ip's container, because you will need know it to connect Grafana with Prometheus
because you are working with docker
