public class Grader {//command shift T to create a test class

    public char determineGrade (int numberGrade)
    {
        if (numberGrade < 0)
        {   //since we have exception here, then we need to use assertThrows in the test file.
            throw new IllegalArgumentException("Number grade cannot find");
        }
        else if (numberGrade < 60)
        {
            return 'F';
        }
        else if (numberGrade < 70)
        {
            return 'D';
        }
        else if (numberGrade < 80)
        {
            return 'C';
        }
        else if (numberGrade < 90)
        {
            return 'B';
        }
        else
        {
            return 'A';
        }
    }
}
