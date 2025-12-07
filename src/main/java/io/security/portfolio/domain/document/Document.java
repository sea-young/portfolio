package io.security.portfolio.domain.document;

import io.security.portfolio.domain.BaseTimeEntity;
import io.security.portfolio.domain.team.Team;
import io.security.portfolio.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "documents")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Document extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Lob
    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_team_id", nullable = false)
    private Team ownerTeam;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id", nullable = false)
    private User author;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private Classification classification;

    public enum Classification {
        PUBLIC, INTERNAL, CONFIDENTIAL, SECRET
    }

    // 서비스 계층에서 안전하게 객체를 생성할 수 있도록 생성자에 Builder 적용
    @Builder
    public Document(String title, String content, Team ownerTeam, User author, Classification classification) {
        this.title = title;
        this.content = content;
        this.ownerTeam = ownerTeam;
        this.author = author;
        this.classification = classification;
    }
}