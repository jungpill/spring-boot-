package jpabook.jpashop.domain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAMAIN {
    public static void main(String[] args) {
        // persistence.xml을 읽으며 hello라는 이름의 persistence-unit 설정을 찾음
        // EntityManageFactory는 DB연결 설정 및 Hibernate내부 초기화, 엔티티 메타데이터 분석 작업 등을 함
        // 무거운 작업이기 때문에 프로젝트 최초 실행시에만 1회 실행
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        // EntityManaget은 엔티티를 관리하는 객체 엔티티 저장, 조회, 삭제, 변경 감지 등을 담당
        // 새 객체를 저장 대상에 올리며 커밋 시점에 insert SQL을 보냄
        // 조회한 객체를 메모리에서 관리하며 값이 바뀌면 update를 자동 반영
        EntityManager em = emf.createEntityManager();

        // 트랜잭션 객체 얻기
        // DB작업은 트랜잭션 안에서 이뤄져야 함
        EntityTransaction tx = em.getTransaction();

        // 트랜잭션 시작
        // 디비는 작업 단위를 보장해야 함
        // Member데이터 저장 중간에 에러가 발생시 절반만 저장되면 안되고 아예 저장 x거나 끝까지 다 저장 해야함
        // 그걸 보장하는게 트랜잭션
        tx.begin();
    }
}
