package com.wave.arh.domain.problem.domain

import com.wave.arh.domain.BaseEntity
import com.wave.arh.domain.review.domain.Review
import jakarta.persistence.*
import lombok.AccessLevel
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.NoArgsConstructor

@Entity
@Table(name = "problem")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
class Problem(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "problem_id")
    val id: Long,
//    @ManyToOne
//    @JoinColumn(name = "member_id", updatable = false)
//    var writer: Member? = null,
    var title: String,
    var link: String,
    var level: Int,
    @Builder.Default
    @OneToMany(mappedBy = "problem", fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    var problemTagList: MutableList<ProblemTag> = mutableListOf(),
    @Builder.Default
    @OneToMany(mappedBy = "problem", fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    var reviewList: MutableList<Review> = mutableListOf(),
) : BaseEntity() {

    fun setReview(review: Review) {
        this.reviewList = mutableListOf(review)
    }

}
