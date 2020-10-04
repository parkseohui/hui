package org.aptogether.service;

import java.util.List;

import org.aptogether.domain.Criteria;
import org.aptogether.domain.MarketBoardVO;
import org.aptogether.mapper.MarketBoardMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class MarketServiceImpl implements MarketBoardService{

	private MarketBoardMapper mapper;
	
	@Override
	public void register(MarketBoardVO market) {
		// TODO Auto-generated method stub
		log.info("���");
		mapper.insertMarketProduct(market);
	}

	@Override
	public MarketBoardVO get(int seq) {
		// TODO Auto-generated method stub
		log.info("������");
		return mapper.detailMarketProduct(seq);
	}

	@Override
	public boolean modify(MarketBoardVO market) {
		// TODO Auto-generated method stub
		log.info("����");
		
		return mapper.updateMarketProduct(market)==1;
	}

	@Override
	public boolean remove(int seq) {
		// TODO Auto-generated method stub
		log.info("����");
		return mapper.deleteMarketProduct(seq)==1;
	}

	@Override
	public List<MarketBoardVO> getlist(Criteria cri,int apt_seq) {
		// TODO Auto-generated method stub
		log.info("��ϰ�������");
		//return mapper.listMarketProduct();
		return mapper.getListWithPaging(cri,apt_seq);
	}

	@Override
	public int getTotal(Criteria cri) {
		// TODO Auto-generated method stub
		log.info("get total count");
		return mapper.getTotalCount(cri);
	}
	

}
