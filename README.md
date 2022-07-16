# SpringBoot TeamProject 
### dolbomi(돌보미)
돌보미란? 남녀노소 누구나 케어가 필요하다면 본인을 책임지고 담당할 매니저와 매칭시켜 서비스를 제공해준다.   
프로젝트에서 맡은 역할 : 메인페이지 제작, 동행/돌봄 서비스 신청 및 결제 구현

<hr/>

### 프로젝트를 통해 느낀점 : 
기획부터 퍼블리싱, 프론트엔드, 백엔드까지 순서대로 한 단계씩 만들어가며 경험해보니 내가 조금 더 흥미가 있었고 
즐기면서 했던 부분이 백엔드 개발이라는 것을 깨닿는 프로젝트였다. 실력있는 백엔드 개발자가 되는 목표가 하나 생겼다. 

동행/돌봄 서비스 신청서를 작성하는 페이지에서 사용자에게 주소를 입력받는 부분에서 다음 우편번호 api를 사용했고
결제 기능을 구현할 때 아임포트 카카오페이 결제 api를 사용했는데 오픈 api를 사용해본 적이 별로 없어서 api를 사용할 때 
시간을 많이 사용했지만 구현했을 때 뿌듯함과 익숙함을 얻었다.

#### [결제구현](https://github.com/da2hn/KakaoPay) 
<hr/>

### 아쉬웠던점 : 
결제 방식을 후불 결제로 계획해서 서비스 종료된 데이터들을 DB에서 가져와 예약종료내역 페이지에 전달하는 작업을 팀원분이 구현하면 
pull 받아서 결제 기능을 구현하려고 했는데 담당하신 팀원분과 소통이 부족해 프로젝트 기간 막바지에 pull 받아 결제 기능 작업이 들어갔고 
결제 테이블이 필요하다는걸 그때 깨달았지만 시간이 부족해 단순히 결제 기능만 구현하게 되었다. 소통이 잘 이루어졌다면 RestAPI로 데이터를 받아서
DB에 저장하고 환불 기능도 구현할 수 있었을 거라는 아쉬움이 남는다.

시간이 부족해 최대한 주요 서비스들을 먼저 구현하도록 해서 메인 서비스들은 다 구현해 시연했지만, 몇몇 기능들을 구현하지 못해 시연하는데 있어서 매끄럽지 못했고
스스로 느끼기에 프로젝트의 전체적인 부분을 봤을때 완성도가 높지 않다는 생각이 들어 아쉬웠다. 협업이 처음이기도 하고 형상관리에 부족한 부분이 있어서 팀원들과 병합하는 과정에서
충돌이 생겨 오류를 해결하는 시간이 많았던 거 같다. 앞으로는 형상관리를 제대로 하기 위해 git을 더 공부할 생각이다.

<hr/>

### 프로젝트에서 사용한 스택 : HTML, CSS, JavaScript, jQuery, Thymeleaf, SpringBoot

