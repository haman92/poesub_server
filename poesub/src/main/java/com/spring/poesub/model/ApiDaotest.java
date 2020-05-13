package com.spring.poesub.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ApiDaotest {

	@Autowired
	private SqlSession sqlSession;

	public int selecttest(){
		return sqlSession.selectOne("com.spring.poesub.db.PreviewDataMapper.selecttest");
	}
	public List<PREAscendancy_Gem> selectpreviewasc()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.PreviewDataMapper.previewselectasc");
	}
	public List<PREAscendancy_Gem> selectpreviewass()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.PreviewDataMapper.previewselectass");
	}
	public List<PREAscendancy_Gem> selectpreviewber()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.PreviewDataMapper.previewselectber");
	}
	public List<PREAscendancy_Gem> selectpreviewcha()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.PreviewDataMapper.previewselectcha");
	}
	public List<PREAscendancy_Gem> selectpreviewchi()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.PreviewDataMapper.previewselectchi");
	}
	public List<PREAscendancy_Gem> selectpreviewdea()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.PreviewDataMapper.previewselectdea");
	}
	public List<PREAscendancy_Gem> selectpreviewele()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.PreviewDataMapper.previewselectele");
	}
	public List<PREAscendancy_Gem> selectpreviewgla()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.PreviewDataMapper.previewselectgla");
	}
	public List<PREAscendancy_Gem> selectpreviewgua()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.PreviewDataMapper.previewselectgua");
	}
	public List<PREAscendancy_Gem> selectpreviewhie()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.PreviewDataMapper.previewselecthie");
	}
	public List<PREAscendancy_Gem> selectpreviewinq()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.PreviewDataMapper.previewselectinq");
	}
	public List<PREAscendancy_Gem> selectpreviewjug()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.PreviewDataMapper.previewselectjug");
	}
	public List<PREAscendancy_Gem> selectpreviewnec()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.PreviewDataMapper.previewselectnec");
	}
	public List<PREAscendancy_Gem> selectpreviewocc()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.PreviewDataMapper.previewselectocc");
	}
	public List<PREAscendancy_Gem> selectpreviewpat()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.PreviewDataMapper.previewselectpat");
	}
	public List<PREAscendancy_Gem> selectpreviewrai()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.PreviewDataMapper.previewselectrai");
	}
	public List<PREAscendancy_Gem> selectpreviewsab()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.PreviewDataMapper.previewselectsab");
	}
	public List<PREAscendancy_Gem> selectpreviewsla()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.PreviewDataMapper.previewselectsla");
	}
	public List<PREAscendancy_Gem> selectpreviewtri()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.PreviewDataMapper.previewselecttri");
	}
	
	public List<Total> selectlabyrinthladderdata()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.PreviewDataMapper.labyrinthladderdata");
	}
	
	public List<PREAscendancy_Gem> ascselectasc()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.AscendancydataMapper.ascendancyselectasc");
	}
	
	public List<PREAscendancy_Gem> ascselectass()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.AscendancydataMapper.ascendancyselectass");
	}
	public List<PREAscendancy_Gem> ascselectber()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.AscendancydataMapper.ascendancyselectber");
	}
	public List<PREAscendancy_Gem> ascselectcha()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.AscendancydataMapper.ascendancyselectcha");
	}
	public List<PREAscendancy_Gem> ascselectchi()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.AscendancydataMapper.ascendancyselectchi");
	}
	public List<PREAscendancy_Gem> ascselectdea()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.AscendancydataMapper.ascendancyselectdea");
	}
	public List<PREAscendancy_Gem> ascselectele()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.AscendancydataMapper.ascendancyselectele");
	}
	public List<PREAscendancy_Gem> ascselectgla()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.AscendancydataMapper.ascendancyselectgla");
	}
	public List<PREAscendancy_Gem> ascselectgua()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.AscendancydataMapper.ascendancyselectgua");
	}
	public List<PREAscendancy_Gem> ascselecthie()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.AscendancydataMapper.ascendancyselecthie");
	}
	public List<PREAscendancy_Gem> ascselectinq()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.AscendancydataMapper.ascendancyselectinq");
	}
	public List<PREAscendancy_Gem> ascselectjug()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.AscendancydataMapper.ascendancyselectjug");
	}
	public List<PREAscendancy_Gem> ascselectnec()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.AscendancydataMapper.ascendancyselectnec");
	}
	public List<PREAscendancy_Gem> ascselectocc()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.AscendancydataMapper.ascendancyselectocc");
	}
	public List<PREAscendancy_Gem> ascselectpat()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.AscendancydataMapper.ascendancyselectpat");
	}
	public List<PREAscendancy_Gem> ascselectrai()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.AscendancydataMapper.ascendancyselectrai");
	}
	public List<PREAscendancy_Gem> ascselectsab()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.AscendancydataMapper.ascendancyselectsab");
	}
	public List<PREAscendancy_Gem> ascselectsla()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.AscendancydataMapper.ascendancyselectsla");
	}
	public List<PREAscendancy_Gem> ascselecttri()
	{
		
		return sqlSession.selectList("com.spring.poesub.db.AscendancydataMapper.ascendancyselecttri");
	}
	
	

}