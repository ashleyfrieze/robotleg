# Robot Leg Problem

Using a DI container, allow a robot to be created that has two legs. A leg is of type Leg, but the left leg has a foot of type LeftFoot and the right leg has a foot of type RightFoot.

The attached code, which can be tested by running `main` on the application class, uses Spring in a conventional way to construct a robot.

Output:

```txt
Robot{leftLeg=Leg{foot=LeftFoot{}}, rightLeg=Leg{foot=RightFoot{}}}
```
