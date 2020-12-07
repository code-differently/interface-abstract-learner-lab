package com.codedifferntly.interfaces;

//Create an Instructor class such that:
//Instructor is a subclass of Person
//Instructor implements the Teacher interface
//Instructor should have a concrete implementation of the teach method
//      which invokes the learn method on the specified Learner object.
//Instructor should have a concrete implementation of the lecture method
//      which invokes the learn method on each of the elements in the specified array of Learner objects.
//numberOfHours should be evenly split amongst the learners.
//double numberOfHoursPerLearner = numberOfHours / learners.length;

public class Instructor extends Person implements Teacher {

    public Instructor(long id){
        super(id);
    }
    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[]learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner learner : learners) {
            learner.learn(numberOfHoursPerLearner);
        }

//        @Override
//        public void lecture(Learner[]learners, double numberOfHours) {
//            double numberOfHoursPerLearner = numberOfHours / learners.length;
//            for (int i = 0; i < learners.length; i++) {
//                learners[i].learn(numberOfHoursPerLearner);
//            }
       //The commented out code below was put in Slack by Matt. I learned it is an enhanced for loop
            //which is a simpler way to do an array when we don't need to work directly with
            // iterators or indexes. The colon is read as "in". I did the standard array above
            //to see if it would work, and to help me with comprehension. Then I learned that IntelliJ
            //will change the whole thing over to an enhanced for loop for you!!! Woo Hoo!! So then I
            //copied the array code, commented it out, then pasted it above so I could let IntelliJ
            // do it's thing, which was exactly what Matt had already done! That was fun!


//    public void lecture(Learner[] learners, double numberOfHours) {
//       double numberOfHoursPerLearner = numberOfHours / learners.length;
//       for(Learner learner : learners) {
//           learner.learn(numberOfHoursPerLearner);
       }
   }










