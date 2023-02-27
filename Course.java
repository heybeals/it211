class Course{
    private String courseNum;
    private String courseTitle;

    void setCourseNum (String inputCourseNum) {
        courseNum = inputCourseNum;
    }

    String getCourseNum() {
        return courseNum;
    }

    void printCourseInfo() {
        System.out.println("Course Number:" + courseNum);
        System.out.println("Course Title:" + courseTitle);
    }
}

class OfferedCourse extends Course{
    private String profName;
    private String location;
    private String classTime;

    void setProfName (String inputProfName) {
        profName = inputProfName;
    } 

    String getProfName() {
        return profName;
    }

    void setLocation (String inputLocation) {
        location = inputLocation;
    } 

    String getLocation() {
        return location;
   
    }void setClassTime (String inputClassTime) {
        classTime = inputClassTime;
    } 

    String getClassTime() {
        return classTime;
    }

    void printCourseInfo() {
        super.println("Course Number:" + courseNum);
        super.println("Course Title:" + courseTitle);
        System.out.println("Instructor Name:" + profName);
        System.out.println("Location:" + location);
        System.out.println("Class Time:" + classTime);
    }
}