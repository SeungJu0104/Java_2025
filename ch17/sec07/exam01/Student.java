package ch17.sec07.exam01;

public class Student implements Comparable<Student> {
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() { return name; }
	public int getScore() { return score; }

	@Override
	public int compareTo(Student o) {
		return(score - o.score); // -> 오름차순. 반대로 빼면 내림차순.
		//return Integer.compare(score, o.score);
	}
}