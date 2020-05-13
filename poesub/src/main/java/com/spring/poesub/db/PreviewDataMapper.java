package com.spring.poesub.db;


import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.spring.poesub.model.PREAscendancy_Gem;
import com.spring.poesub.model.Total;

@Mapper
public interface PreviewDataMapper {
    public int selecttest();
    public List<PREAscendancy_Gem> previewselectasc();
    public List<PREAscendancy_Gem> previewselectass();
    public List<PREAscendancy_Gem> previewselectber();
    public List<PREAscendancy_Gem> previewselectcha();
    public List<PREAscendancy_Gem> previewselectchi();
    public List<PREAscendancy_Gem> previewselectdea();
    public List<PREAscendancy_Gem> previewselectele();
    public List<PREAscendancy_Gem> previewselectgla();
    public List<PREAscendancy_Gem> previewselectgua();
    public List<PREAscendancy_Gem> previewselecthie();
    public List<PREAscendancy_Gem> previewselectinq();
    public List<PREAscendancy_Gem> previewselectjug();
    public List<PREAscendancy_Gem> previewselectnec();
    public List<PREAscendancy_Gem> previewselectocc();
    public List<PREAscendancy_Gem> previewselectpat();
    public List<PREAscendancy_Gem> previewselectrai();
    public List<PREAscendancy_Gem> previewselectsab();
    public List<PREAscendancy_Gem> previewselectsla();
    public List<PREAscendancy_Gem> previewselecttri();
    public List<Total> labyrinthladderdata();
}
