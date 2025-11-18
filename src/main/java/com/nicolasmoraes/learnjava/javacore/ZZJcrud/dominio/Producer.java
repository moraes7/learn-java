package com.nicolasmoraes.learnjava.javacore.ZZJcrud.dominio;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Producer {
    Integer id;
    String name;

}
