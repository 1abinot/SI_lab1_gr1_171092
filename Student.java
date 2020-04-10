class Student {
	String index;
	String firstName;
	String lastName;
	int []labPoints;
	//TODO constructor

	public Student(String index, String firstName, String lastName, int[] labPoints) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}

	//TODO seters & getters

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int[] getLabPoints() {
		return labPoints;
	}

	public void setLabPoints(int[] labPoints) {
		this.labPoints = labPoints;
	}


	public double getAverage() {
		//TODO
		double sum = 0;
		for(int i=0;i<labPoints.length;i++){
			sum+=labPoints[i];
		}
		return sum/labPoints.length;
	}

	public boolean hasSignature() {
		//TODO
		return labPoints.length>8;
	}
}

class Course{
	class Course{
		private List<Student> students;
		private String courseName;
		//Constructor


		public Course(String courseName) {
			this.students = new ArrayList<Student>();
			this.courseName = courseName;
		}

		//add student
		public void addStudent(Student student){
			if(students.contains(student)){
				return;
			}else
				students.add(student);
		}

		//delete student
		public void deleteStudent(Student student) {
			if (students.contains(student)) {
				students.remove(student);
			}else
				System.out.println("Studentot ne postoi vo kursot");
			return;
		}


		//informacii za studentot
		public void pecati() {
			for (int i = 0; i < students.size(); i++) {
				System.out.println(students.get(i).index + " " + students.get(i).firstName + " " + students.get(i).lastName + " " +students.get(i).getAverage());
			}
		}
	}
}