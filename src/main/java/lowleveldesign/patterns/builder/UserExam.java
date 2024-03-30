package lowleveldesign.patterns.builder;

//https://docs.google.com/document/d/1v7VatmtVb8zz5VwxSs9kLAipIgWp46_ZlZCiLiUN820/edit
public class UserExam {
    private int englishMarks;
    private int scienceMarks;
    private int mathsMarks;
    private String name;
    // this class is immutable and hence can't have any setters

    public static UserExamBuilder getBuilder() {
        return new UserExamBuilder();
    }

    public static class UserExamBuilder {
        private int englishMarks;
        private int scienceMarks;
        private int mathsMarks;
        private String name;

        // UserExamBuilder is not immutable, it is a helper class to create objects of UserExam class only after all validations have passed
        // Unlike UserExam class, it has setter methods.
        public UserExam build() {
            // Step 1: validations
            if(englishMarks >100 || scienceMarks >100 || mathsMarks > 100) {
                throw new IllegalArgumentException("Marks can't be gretaer than 100");
            }
            if(mathsMarks + scienceMarks > 190) { // validations across attributes, that's why we don't do validation inside setter methods
                throw new IllegalArgumentException("mathsMarks + scienceMarks can't be greater than 190");
            }
            if(name.startsWith("0")) {
                throw new IllegalArgumentException("name can't start with 0");
            }
            UserExam userExam = new UserExam();
            userExam.englishMarks= this.englishMarks;
            userExam.mathsMarks = this.mathsMarks;
            userExam.scienceMarks = this.scienceMarks;
            userExam.name = this.name;
            return userExam;
        }

        public int getEnglishMarks() {
            return englishMarks;
        }

        public UserExamBuilder setEnglishMarks(int englishMarks) {
            this.englishMarks = englishMarks;
            return this;
        }

        public int getScienceMarks() {
            return scienceMarks;
        }

        public UserExamBuilder setScienceMarks(int scienceMarks) {
            this.scienceMarks = scienceMarks;
            return this;
        }

        public int getMathsMarks() {
            return mathsMarks;
        }

        public UserExamBuilder setMathsMarks(int mathsMarks) {
            this.mathsMarks = mathsMarks;
            return this;
        }

        public String getName() {
            return name;
        }

        public UserExamBuilder setName(String name) {
            this.name = name;
            return this;
        }
    }
}
