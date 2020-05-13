package com.spring.poesub.db;


import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.spring.poesub.model.Ascendancy_Gem;
import com.spring.poesub.model.PREAscendancy_Gem;

@Mapper
public interface AscendancydataMapper {
    public int selecttest();
    public List<Ascendancy_Gem> ascendancyselectasc();
    public List<Ascendancy_Gem> ascendancyselectass();
    public List<Ascendancy_Gem> ascendancyselectber();
    public List<Ascendancy_Gem> ascendancyselectcha();
    public List<Ascendancy_Gem> ascendancyselectchi();
    public List<Ascendancy_Gem> ascendancyselectdea();
    public List<Ascendancy_Gem> ascendancyselectele();
    public List<Ascendancy_Gem> ascendancyselectgla();
    public List<Ascendancy_Gem> ascendancyselectgua();
    public List<Ascendancy_Gem> ascendancyselecthie();
    public List<Ascendancy_Gem> ascendancyselectinq();
    public List<Ascendancy_Gem> ascendancyselectjug();
    public List<Ascendancy_Gem> ascendancyselectnec();
    public List<Ascendancy_Gem> ascendancyselectocc();
    public List<Ascendancy_Gem> ascendancyselectpat();
    public List<Ascendancy_Gem> ascendancyselectrai();
    public List<Ascendancy_Gem> ascendancyselectsab();
    public List<Ascendancy_Gem> ascendancyselectsla();
    public List<Ascendancy_Gem> ascendancyselecttri();
    
}
