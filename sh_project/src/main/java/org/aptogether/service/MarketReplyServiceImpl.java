package org.aptogether.service;

import java.util.List;

import org.aptogether.domain.Criteria;
import org.aptogether.domain.MarketReplyVO;
import org.aptogether.mapper.MarketReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
@Service
@Log4j
public class MarketReplyServiceImpl implements MarketReplyService{
	
	@Setter(onMethod_=@Autowired)
	private MarketReplyMapper mapper;

	@Override
	public int ReplyRegister(MarketReplyVO vo) {
		// TODO Auto-generated method stub
		log.info("reply register����");
		return mapper.marketReplyInsert(vo);
	}

	@Override
	public MarketReplyVO ReplyGet(int replyNo) {
		// TODO Auto-generated method stub
		log.info("reply get����");
		return mapper.marketReplyRead(replyNo);
	}

	@Override
	public int ReplyModify(MarketReplyVO vo) {
		// TODO Auto-generated method stub
		log.info("reply modify����");
		return mapper.marketReplyUpdate(vo);
	}

	@Override
	public int ReplyRemove(int replyNo) {
		// TODO Auto-generated method stub
		log.info("reply remove����");
		return mapper.marketReplyDelete(replyNo);
	}

	@Override
	public List<MarketReplyVO> ReplyGetList(Criteria cri, int seq) {
		// TODO Auto-generated method stub
		log.info("reply getlist����");
		return mapper.getListWithPaging(cri,seq);
	}

}
