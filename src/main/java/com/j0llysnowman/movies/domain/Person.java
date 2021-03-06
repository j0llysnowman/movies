package com.j0llysnowman.movies.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by david on 6/11/16.
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Person extends BaseEntity<Person> {

    private String name;

    @Override
    public UriParts<Person> getUriParts() {
        return new UriParts<>(this);
    }

}
