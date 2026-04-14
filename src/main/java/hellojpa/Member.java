//package hellojpa;
//
//import javax.persistence.*;
//import java.util.Date;
//
//public class Member {
//
//    @Id
//    private Long id;
//
//    // 객체에서는 username으로 사용 db에서응 name으로 사용
//    @Column(name = "name")
//    private String username;
//
//    private Integer age;
//
//    @Enumerated(EnumType.STRING)
//    private RoleType roleType;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createDate;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date lsatModifiedDate;
//
//    // varchar를 넘어서 더 큰 데이터를 넣고 싶은 경우 사용하는 타입 Lab
//    @Lob
//    private String description;
//
//    public Member(){
//
//    }
//
//}
