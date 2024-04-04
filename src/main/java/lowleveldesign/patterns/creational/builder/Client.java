package lowleveldesign.patterns.creational.builder;

public class Client {
    public static void main(String[] args) {
        UserExam.UserExamBuilder userExamBuilder = UserExam.getBuilder();
        UserExam userExam = userExamBuilder.setName("Aman")
                .setEnglishMarks(90)
                .setMathsMarks(80)
                .setScienceMarks(80)
                .build();

    }
}
