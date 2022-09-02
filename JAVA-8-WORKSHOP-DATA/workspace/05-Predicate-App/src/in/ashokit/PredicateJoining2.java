package in.ashokit;

import java.util.function.Predicate;

public class PredicateJoining2 {

	public static boolean isMemberAllowedInPortal(Member m, Predicate<Member> p1, Predicate<Member> p2) {
		Predicate<Member> p = p1.and(p2);
		return p.test(m);
	}

	public static void main(String[] args) {

		Member m = new Member("Kailash", 62);

		Predicate<Member> p1 = (member) -> member.age >= 21;

		Predicate<Member> p2 = (member) -> member.age <= 60;

		boolean memberAllowedInPortal = isMemberAllowedInPortal(m, p1, p2);
		System.out.println("Is Allowed ?? :: " + memberAllowedInPortal);

	}

}

class Member {
	String name;
	Integer age;

	public Member(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

}