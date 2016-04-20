package com.innominds.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.innominds.service.PrimaryService;

@Service("primaryTwoSevice")
@Primary
public class PrimaryServiceTwoImpl implements PrimaryService {

}
