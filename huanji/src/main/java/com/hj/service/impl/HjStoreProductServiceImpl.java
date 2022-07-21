package com.hj.service.impl;

import com.hj.dao.HjStoreProductMapper;
import com.hj.entity.HjStoreProduct;
import com.hj.service.HjStoreProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HjStoreProductServiceImpl implements HjStoreProductService {

    @Autowired
    HjStoreProductMapper hjStoreProductMapper;

    @Override
    public Integer add(HjStoreProduct hjStoreProduct) {
        return null;
    }

    @Override
    public Integer update(HjStoreProduct hjStoreProduct) {
        return null;
    }
}
