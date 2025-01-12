# `Report for assignment 4 - Group 8`

## `Project`

Name: Twilio-Java

URL: https://github.com/DD2480-Group-8/twilio-java

Twilio is a SaaS with the purpose of helping companies connect with their customers. It can be used to build customer support systems such as chat bots, managing incoming phone calls, etc. The Twilio-java project is the Java SDK to use Twilio in Java development.

## `Onboarding experience`

### `Did you choose a new project or continue on the previous one?`

We chose a different project this time around, since the project used in assignment 3 was both inactive and had very few issues, and even fewer that interested us. Therefore, a few hours were spent trying to find a project with an issue that felt interesting while being at a reasonable level of difficulty.

### `If you changed the project, how did your experience differ from before?`

The onboarding of this project, as compared to the previous one was drastically different, the project used in assignment 3 didn't have any build instructions at all, whereas the twilio project had plenty of instructions, such as the supported versions of JDK, the fact that it used maven, and instructions on how to compile the project on your own. Further, since it is a service, it had some instructions on how to use the API, which is good to get some knowledge of where the entry point is.

## `Effort spent`

For each team member, how much time was spent in each step. Links to relevant commit. 

### Emil (23h)

1. Find relevant issue `1h`

2. Meetings `5,5h`

3. setup of project/onboarding `1h`  
(A couple of internal packages didn't resolve, tinkered with project structure but resetting intellij finally solved it.)

4. reading documentation `4,5h`

5. analyzing code/output `2h`

6. write documentation `3h`
  - [docs](https://github.com/DD2480-Group-8/twilio-java/commit/de9621278a8731e6e56e754c78251e298cb54fcc) 
  - [docs](https://github.com/DD2480-Group-8/twilio-java/commit/f742ad756e4c7bc66d085d7ffe61c9665449e48f)

7. writing code `4h`
  - [code](https://github.com/DD2480-Group-8/twilio-java/commit/33d7dc3a07954a148f9939d00e4d5f98189b991a)
  - [tests](https://github.com/DD2480-Group-8/twilio-java/commit/ab2861adf5302354dfe68def933dff7fb44cd36b)

8. Running code (test) `2h`

### Joakim (22h)

1. Find relevant issue `1h`

2. Meetings `5,5h`

3. setup of project/onboarding `1h`  

4. reading documentation `2,5h`

5. analyzing code/output `2h`

6. write documentation `2h`
  - [docs](https://github.com/DD2480-Group-8/twilio-java/commit/a05cf771460d5d2b3de44d060bc5cb087878c5db)
  - [docs](https://github.com/DD2480-Group-8/twilio-java/commit/64db5328d94903e8089f57510339430470bbf09c)

7. writing code `6,5h`
  - [code](https://github.com/DD2480-Group-8/twilio-java/commit/dd1eb0c458ece2178a37055314a43a01a820a382)
  - [test](https://github.com/DD2480-Group-8/twilio-java/commit/158fd06c74bfc7c53933970c35e5fa79d7a43186)

8. Running code (test) `1,5h`

### Viktor (20h)

1. Find relevant issue `1h`

2. Meetings `5,5h`

3. setup of project/onboarding `0,5h`  

4. reading documentation `2h`

5. analyzing code/output `2h`

6. write documentation `3h`
  - [docs](https://github.com/DD2480-Group-8/twilio-java/commit/48709322d2d2d408e6368b3b7334dd103f3f1047)
  - [docs](https://github.com/DD2480-Group-8/twilio-java/commit/33bccd9810fd8ea7c70b7a85314dfa0f3d24993a)

7. writing code `4h`
  - [code](https://github.com/DD2480-Group-8/twilio-java/commit/c40893ca90adebf7ffd0b7cbb2dc40ec683c6802)
  - [tests](https://github.com/DD2480-Group-8/twilio-java/commit/6192b3a852a5e1be51462efbd78ea6e07c74759c)
  
8. Running code (test) `2h`

### Jovan (20h)

1. Find relevant issue `1h`

2. Meetings `5,5h`

3. setup of project/onboarding `2h`  

4. reading documentation `2h`

5. analyzing code/output `2h`

6. write documentation `2,5h`

7. writing code `3h`
  - [code](https://github.com/DD2480-Group-8/twilio-java/commit/ecb54210d078467532e6591aaf524128833bd85a)
  - [tests](https://github.com/DD2480-Group-8/twilio-java/commit/8af7acca520b769fbdc519ae99fe80e59cd72096)

8. Running code (test) `2h`

### Simon (23h)

1. Find relevant issue `2h`

2. Meetings `5,5h`

3. setup of project/onboarding `1h`  (Some dependencies had to be configured. Letting IntelliJ downlaod and index everything take time with bad internet and a slow computer. The correct project structure needed to be configured in IntelliJ.)

4. reading documentation `3h`

5. analyzing code/output `2,5h`

6. write documentation `1h`
  - [docs](https://github.com/DD2480-Group-8/twilio-java/commit/ae8a731acb88b163e15f880668b695c68fd01ad8)
  - [docs](https://github.com/DD2480-Group-8/twilio-java/commit/75b368ce0e7a4d8b8f6c72b210bb3f4dbc50a6f7)

7. writing code `6h`
  - [code](https://github.com/DD2480-Group-8/twilio-java/commit/41c4ff90a15810fe54dbc9623937646f1ef920fb)
  - [test](https://github.com/DD2480-Group-8/twilio-java/commit/3e40e096ebdb6cfcddd19c67a6f6db823f89c993)
  - [cleanup](https://github.com/DD2480-Group-8/twilio-java/commit/b90e61532e632702a0d8451bf5a8acb387871c74)

8. Running code (test) `2h`

For setting up tools and libraries (step 3), enumerate all dependencies
you took care of and where you spent your time, if that time exceeds
30 minutes.


## `Overview of issue(s) and work done.`

Title: "Java library should not use singletons"

URL: https://github.com/twilio/twilio-java/issues/650

In its' current version, the Twilio SDK is initialized using Twilio.init() and is a global singleton, while the issue at hand suggests implementing it in the standard java way, i.e. new Twilio() and giving the user a non-singleton object. This would allow for multiple uses and configurations in a single production environment, as well as increasing testability due to the global scope of singletons. This also conforms more to java standards. 

`Scope (functionality and code affected).`   
Since the singleton instance is accessed through static methods all over the code base, it is a massive refactoring, something that we noticed as worked progressed rather than instantly. When changing one thing, a ton of classes referencing static methods in the twilio class break. In total, around 10 library classes are affected, 3 classes with examples of how to use the code, and hundreds of test classes. However, many of the changes needed are quite easily achievable by simply replacing many identical lines of code using an IDE or text editor. 

## `Requirements for the new feature or requirements affected by functionality being refactored`

Requirement: Enable multiple instances of the Twilio API separately while still maintaining all of the features of the existing version.  

The refactoring concerns the user-facing API, with the new feature of being able to use multiple instances of twilio separately, while still having all functionality remain intact. In other words, the users should be able to invoke:  
Twilio tw1 = new Twilio("usr1", "pwd1")  
Twilio tw2 = new Twilio("usr2", "pwd2")  
and use these two separately, while still maintaining all of the existing features.
This multitenant use would also finally solve the thread safety concerns raised in the [issue referenced by ours](https://github.com/twilio/twilio-java/issues/430).

This means that current tests should of course still pass with the new initialization, and that new tests can be added to test that the multiple uses are separate from eachother.
After a lot of digging and discussion regarding how to change the architecture in the optimal way, we figured that in order to do this, we will change the relevant methods in the base abstract classes to take a Twilio object as a parameter in order for the entire system to be able to reference the same object, even when multiple instances exist. In order to make this possible, the Twilio class needs to be non-static in all the relevant places. We chose to make all fields and methods non-static except for the ExecutorService field and its related methods. The reason for this is that executorservice is related to threading, and threading is not an issue within an instance of an object.

The files that need refactoring to make this happen are:

Twilio.java
* Make all the relevant fields non-static. ExecutorService can remain static.
* Create constructors and remove .init() methods.

TwilioApi.java
* Extract the methods from Twilio.java that are most commonly used by users of the SDK and put them in the interface.

Creator.java
* The .create() methods that reference Twilio.getRestClient() need to be altered to take a Twilio object as an input parameter tw, and call .getRestClient() on that object.

Updater.java
* The .update() methods that reference Twilio.getRestClient() need to be altered to take a Twilio object as an input parameter tw, and call .getRestClient() on that object.

Deleter.java
* The .delete() methods that reference Twilio.getRestClient() need to be altered to take a Twilio object as an input parameter tw, and call .getRestClient() on that object.

Fetcher.java
* The .fetch() methods that reference Twilio.getRestClient() need to be altered to take a Twilio object as an input parameter tw, and call .getRestClient() on that object.

Reader.java
* The .read() methods that reference Twilio.getRestClient() need to be altered to take a Twilio object as an input parameter tw, and call .getRestClient() on that object.

Issue: Implement a TwilioAPI interface and refactor the Twilio.java file and all of it's usages to make use of non-static methods as well as the new initializer.

## `Code changes`

### `Patch`

`run in ./twilio-java`  
Twilio.java
```
git diff a540ced19643008a7a034e9ef3f1d0502314d9b9 bc0d329c013e1529abe2637d5901d6b5561ae334 "./src/main/java/com/twilio/Twilio.java"
```

TwilioAPI.java
```
git diff a540ced19643008a7a034e9ef3f1d0502314d9b9 bc0d329c013e1529abe2637d5901d6b5561ae334 "./src/main/java/com/twilio/TwilioAPI.java"
```

Creator.java
```
git diff a540ced19643008a7a034e9ef3f1d0502314d9b9 bc0d329c013e1529abe2637d5901d6b5561ae334 "./src/main/java/com/twilio/base/Creator.java"
```

Deleter.java  
```
git diff a540ced19643008a7a034e9ef3f1d0502314d9b9 bc0d329c013e1529abe2637d5901d6b5561ae334 "./src/main/java/com/twilio/base/Deleter.java"
```

Fetcher.java
```
git diff a540ced19643008a7a034e9ef3f1d0502314d9b9 bc0d329c013e1529abe2637d5901d6b5561ae334 "./src/main/java/com/twilio/base/Fetcher.java"
```

Reader.java
```
git diff a540ced19643008a7a034e9ef3f1d0502314d9b9 bc0d329c013e1529abe2637d5901d6b5561ae334 "./src/main/java/com/twilio/base/Reader.java"
```

Updater.java
```
git diff a540ced19643008a7a034e9ef3f1d0502314d9b9 bc0d329c013e1529abe2637d5901d6b5561ae334 "./src/main/java/com/twilio/base/Updater.java"
```

./example
```
git diff a540ced19643008a7a034e9ef3f1d0502314d9b9 bc0d329c013e1529abe2637d5901d6b5561ae334 "./src/main/java/com/twilio/example/"
```

TwilioTest.java  
```
git diff a540ced19643008a7a034e9ef3f1d0502314d9b9 bc0d329c013e1529abe2637d5901d6b5561ae334 "./src/test/java/com/twilio/TwilioTest.java"
```

## `Test results`

Test logs before/after changes can be found in the Logs folder in the repository.

## `UML class diagram and its description`
### `Before`
![TwilioUMLbefore](https://user-images.githubusercontent.com/29179827/156886053-98acced6-ac30-4cf6-9713-bd84cb448c5f.png)

### `After`
![TwilioUML drawio](https://user-images.githubusercontent.com/29179827/156884986-49db2d55-35bc-40e7-87e4-384e1d26a1fb.png)

Shows how the Twilio class implements the TwilioAPI interface, and how Twilio.java is at the center of the SDK.  
The abstract classes (Creator, Fetcher, Updater, Reader, Deleter) are base classes inherited by other services such as Messages, etc, and is the foundation upon which these services build upon. A core part of these services is to utilize the TwilioRestClient for network transactions, which is now tied to certain instances of the Twilio Class, as opposed to a singleton used in sdk version 8 and before.

### `Key changes/classes affected`

Optional (point 1): Architectural overview.

There were a couple design patterns that were used in the previous implementation that was removed with the new implementation:

Creational pattern Singleton: This design pattern is no longer used as per requirement for the issue. 

Concurrency pattern Event-based synchronous: This design pattern is no longer used since there is no longer a singleton instance, meaning there is no longer a need to adress the asynchronous pattern for multithreaded programs.


## `Overall experience`

### `What are your main take-aways from this project? What did you learn?`

The overall experience of working within this project has been really nice. The project used maven which we are familiar with, having used it in assignment 1 and 2, and built fine as long as a supported JDK was used. Further, the readme has clear build instructions which allowed us all to get going quite quickly. The project is 250k loc, with more than 3000 tests, which felt a bit daunting at first, but after diving into the codebase we noticed that the code was actually quite modular; in the end we only had to refactor 6-7 classes. This definitely taught us valuable lessons in working with open source software, and how issues that at first seem quite large can actually have a smaller solution, as long as you know the software and codebase you are working with. Getting to know it can take some time, but it is doable even in large projects such as this one. Seeing as this was also a more "serious" project, with rules regarding contributing, than the one we used in assignment 3, it gave us a greater understanding of what is expected by contributors in terms of conforming to existing standards etc. 

### `Essence`

| State      | Checklist | Fulfilled (yes/no/comments) |
| ----------- | ----------- | ----------- |
| Seeded      | The team mission has been defined in terms of the opportunities and outcomes. <br> Constraints on the team's operation are known. <br> Mechanisms to grow the team are in place.<br> The composition of the team is defined.<br>Any constraints on where and<br>how the work is carried out are defined.<br>The team's responsibilities are outlined.<br>The level of team commitment is clear.<br>Required competencies are identified.<br>The team size is determined.<br>Governance rules are defined.<br>Leadership model is determined    | Yes |
| Formed   | Individual responsibilities are understood.<br>Enough team members have been recruited to enable the work to progress.<br>Every team member understands how the team is organized and what their individual role is.<br>All team members understand how to perform their work.<br>The team members have met (perhaps virtually) and are beginning to get to know each other.<br>The team members understand their responsibilities and how they align with their competencies.<br>Team members are accepting work.<br>Any external collaborators (organizations, teams and individuals) are identified.<br>Team communication mechanisms have been defined.<br>Each team member commits to working on the team as defined.       | Yes|
| Collaborating | The team is working as one cohesive unit.<br>Communication within the team is open and honest.<br>The team is focused on achieving the team mission.<br>The team members know and trust each other | Partly fulfilled |
| Performing | The team consistently meets its commitments.<br>The team continuously adapts to the changing context.<br>The team identifies and addresses problems without outside help.<br>Effective progress is being achieved with minimal avoidable backtracking and reworking.<br>Wasted work and the potential for wasted work are continuously identified and eliminated.| Partly fulfilled |
| Adjourned | The team responsibilities have been handed over or fulfilled.<br>The team members are available for assignment to other teams.<br>No further effort is being put in by the team to complete the mission.| No |


<h2>
Summmary
</h2>

The current state of the team is between "Collaborating" and "Performing" as some of the criteria are fulfilled for both of the states but not all of them for each state. Since the last assessment of the checklist, the team was also between the "Collaborating" and "Performing" states, however, the team has made progress on both states. The first sentence in the "Collaborating" state has been greatly improved as the assignments have progressed. For this assignment, the delegation of tasks hasn't been obvious but due to more experience in working as a team and overall software development, the team has found ways to work more effectively even in more abstract tasks. Some points that can still be improved are the last points in the "Performing" state. Even though the effectiveness has improved, there are still "unknowns" that has caused unnecessary backtracking on some tasks. This is also connected to the last point since the potential for wasted work is not being continuously identified. This could be improved through having "retrospective" sessions where the team reflects on the previous assignment for example.

Optional (point 6): How would you put your work in context with best software engineering practice?

Optional (point 7): Is there something special you want to mention here?
