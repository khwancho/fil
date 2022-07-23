package krx.ldx.fil.service.impl;

import java.util.List;

import krx.ldx.fil.domain.entity.Test;
import krx.ldx.fil.repository.TestRepository;
import krx.ldx.fil.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

  @Autowired
  private TestRepository testRepository;

//  @Override
//  public List<Test> getTest(String string) {
//
//    List<Test> list = testRepository.findAllTest(string);
//
//    return list;
//  }

}
