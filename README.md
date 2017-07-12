# eventbus-android
sample use of event bus/ boilerplate code

**Gradle Add EventBus**
  `compile 'org.greenrobot:eventbus:3.0.0'`
  
 **Via Maven**
   ```<dependency>
        <groupId>org.greenrobot</groupId>
        <artifactId>eventbus</artifactId>
        <version>3.0.0</version>
      </dependency>```
      
**EventBus : EventBus is a publish/subscribe event bus optimized for Android **
      simplifies the communication between components
      decouples event senders and receivers
      performs well with Activities, Fragments, and background threads
      avoids complex and error-prone dependencies and life cycle issues
      makes your code simpler
      is fast
      is tiny (~50k jar)
      is proven in practice by apps with 100,000,000+ installs
      has advanced features like delivery threads, subscriber priorities, etc.
