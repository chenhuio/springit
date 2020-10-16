package com.neo.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * @author neo
 * @date 2020-10-15 15:58
 */

@Entity
@Data
@NoArgsConstructor
public class Link extends Auditable{

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;


    @OneToMany(mappedBy = "link")
    private List<Comment> comments = new ArrayList<>();
}
