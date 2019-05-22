# Whatever

Library that lets you write your code without worrying about consequences!

![https://i.imgflip.com/31lzxn.jpg](https://i.imgflip.com/31lzxn.jpg)

Have you ever wanted to add some code to your project that you do not care much about? Be it for testing, debugging, or maybe you are just lazy and unwilling to test some piece of code, **would it not be nice if you could do all of those in a safe manner?**

Look no further, this library allows you to do exactly that.

## Motivation

Sometimes, some developers (ok, maybe just me) want to add some code somewhere (sometimes just temporary code that will be deleted later!) that is either completely untested (e.g. because it does not seem necessary, but usually just due to pure laziness) or at least partially untested. This code could, however, brake something even though the developer does not realize it, e.g. if it contains some kind of bug that only manifests itself at runtime. The solution is to write the code in a way that prevents any potential exception from being thrown and disrupt the original execution of the application

Why not just use `try...catch` block? Two main reasons - it's verbose and cumbersome; and it is less expressive - i.e. if you see a try-catch block, it does not occur to you that such code was written because the developer did not wish to break some existing code with it. On the other hand, this library would help you immediately see when such code is written (and that it can be safely removed, probably). 

Third, less important reason, is that this library can be improved and extend with some fun and creative ideas!

## Installation and Usage

Installation with Maven:

```
<dependency>
    <groupId>com.vaclavdedik</groupId>
    <artifactId>whatever</artifactId>
    <version>1.0.0</version>
</dependency>
```

Usage in code:

```

import static whatever.Whatever.whatever;

...

whatever(() -> {
    int x = 5;
    int y = 0;
    
    // broken code, throws exception, but whatever!
    System.out.println(x / y);
});

```


