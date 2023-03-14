package com.wave.arh.domain.problem.domain

import jakarta.persistence.*
import lombok.Getter
import lombok.NoArgsConstructor
import javax.swing.text.html.HTML.Tag

@Getter
@Entity
@NoArgsConstructor
class ProblemTag(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,

    @ManyToOne
    @JoinColumn(name = "problem_id")
    var problem: Problem,

    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "tag_id")
    var tag: Tag
) {


}