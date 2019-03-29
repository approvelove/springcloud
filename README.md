# springcloud
springcloud的一个demo,包含了eureka server, eureka client, ribbon，feign，zuul。

相关说明

eureka server 提供一个服务注册中心

eureka client 提供服务。可以是多个服务的集群，并将这些服务注册在 eureka server 上。

利用ribbon，或者 feign 来实现服务的消费。同时ribbon， feign 都可以用来做负载均衡以及断路器。

最后利用zuul 来实现路由网关。 同时也可以用其来做过滤器。
