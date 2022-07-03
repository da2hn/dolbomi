package com.project.dolbomi.mapper;


import com.project.dolbomi.domain.vo.AccReservationVO;
import com.project.dolbomi.domain.vo.AccReviewDTO;
import com.project.dolbomi.domain.vo.CareReservationVO;
import com.project.dolbomi.domain.vo.CareReviewDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.PropertyValues;

import java.util.List;

@Mapper
public interface CareReservationMapper {
    //    돌봄서비스 예약리스트
    public List<CareReservationVO> CareGetList(Long careReservationNum);
    //    돌봄서비스 예약하기
    public void insert(CareReservationVO careReservationVO);
    //    돌봄서비스 예약정보
    public CareReservationVO select(Long careReservationNum);


    //carereservation review list
    public List<CareReviewDTO> reviewGetListCare(String userEmail);



    // 돌봄서비스 예약자 1명 정보
    public CareReservationVO CareGet(Long careReservationNum);

    //돌봄서비스고객이 매니저 배정수락,user_userdetails 페이지의 돌봄예약목록
    public void CareManagerY(Long careReservationNum);
    // 돌봄서비스 매니저 배정 거절 user_userdetails페이지
    public void CareManagerN(Long careReservationNum);
    // 고객이 예약취소,user_userdetails2 페이지의 돌봄예약 취소
    public int Caredelete(Long careReservationNum);

    //user_userdetails의 카운트 횟수.  CARE_RESERVATION_STATUS 에 따라 변경
    public int caregetTotal5(Long careReservationNum);
    public int caregetTotal6(Long careReservationNum);
    public int caregetTotal7(Long careReservationNum);
    public int caregetTotal8(Long careReservationNum);
}
