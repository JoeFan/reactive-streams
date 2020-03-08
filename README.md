# Reactive Streams <br>
## Akka vs RxJava

Akka和RxJava 都属于高并发java工具库

Akka 用于更简单的构建高并发分布式应用。akka能够构建一个高并发，分布式，消息驱动，高伸缩性的运行在jvm上的应用

Rxjava是一个类库，提供构建异步事件驱动应用，使用观察者序列模式，运行在jvm上，可以使用版本2.0，提供了背压处理。目前在安卓开发应用广泛


|  | AKKA  | RXJAVA | 
|:----------|:----------|:----------|
|Run platfrom| JVM | JVM|
|交互方式|Message based（也有event based）| Event Based|
|是否开源|Yes| Yes|
|可伸缩性 |Resilient/fault-tolerant (Let it crash model)| Resilient/fault-tolerant (Provides variety of operators to recover from errors)|
|可扩展性|Easily Scalable (Scaling across network boundaries)| Scalable (by default Observable is synchronous and requires additional work for asynchronous)|
|License|Apache License V2.0| Apache License V2.0|
|类型|Concurrency Frameworks| Concurrency library|
|响应式 |Yes | Yes |



## 大数据场景适用(Spark, Flink, Kafka stream, Akka)


|  名称 | 适用场景 |
|:----------|:----------|
| Spark    | 如果已经使用交互式查询，机器学习，batch jobs，spark streaming是一个好的选择。可以覆盖大部分的问题，并且能够在streaming和batch应用之间实现逻辑共享。在没有更好的选项时，spark是一个不会错的选择   | 
| Flink    | 如果需要beam提供的复杂语意，以及低延迟；并且不是很不关注streaming和批处理 ，可以选择flink(flink自己的api或者fink+beam) |
| Kafka  stream  | 用kafka stream处理低开销，并且不需要其他工具提供的复杂语意、灵活性的情况。运维管理的开销是最小的，用于kafka问中心的为服务异步处理数据流   |
| Akka    | 如果刘数据来自于为服务后台，并且需要一个全功能支持的选项，akka是一个好的选择。用akka streams实现通用目的，数据处理的为服务    |

## How to build an akka project



gitbub repository: 
[https://github.com/akka/akka](https://github.com/akka/akka)







