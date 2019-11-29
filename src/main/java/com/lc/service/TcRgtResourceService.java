package com.lc.service;

import com.lc.model.entity.TcRgtResource;

import java.util.List;

public interface TcRgtResourceService {
    List selectByParentNo(TcRgtResource tcRgtResource);
}
