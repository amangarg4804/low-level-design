package lowleveldesign.scalerschemadesign.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class ModuleExam extends BaseModel {
    @ManyToOne
    private Module module; // in the db only id will be stored, but in classes we refer to the complete object
    // Cardinality between
    // ModuleExam   :   Module
    //    1         :   1 (1 module exam can object refer to only one module)
    //    M         :   1 (1 module can have many module exams)
    // example: Module with id 2 has exams with id (4, 5, 6)
    // 2, 4
    // 2, 5
    // 2, 6
    // No need to overcomplicate. ModuleExam is a many relationship table, it will have multiple Modules and multiple Exams
    // But JPA needs to know the relationship between ModuleExam and Module.
    // it is many to one. Same with ModuleExam and Exam
    @ManyToOne
    private Exam exam;
    private Date dateOfExam;
}
// JPA notices Many to one and knows that the id has to be on many side of the relationship
// JPA will create constraints in Db when creating tables (create mode)
