package hello.core.springcore.member;

public interface MemberService {
    void join(Member member);
    Member findMember(Long id);
}
