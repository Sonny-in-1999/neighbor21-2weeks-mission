# 사내 2주 미션 

### 카카오맵 사용법 숙지를 위해 2주 미션을 수행합니다.

#### 각 과제별 요구사항에 맞게 카카오맵 API를 사용하여 지도를 구현합니다.
#### [Neighbor System](http://neighbor21.co.kr)

---

### 1. 미션1: 폴리라인(완료)
#### 요구사항
- link.json 파일의 데이터를 받아와 위도 경도 값을 사용하여 지도 내 polyline을 표출한다.
- Bounds 기능을 활용하여 line을 그린 후 중심좌표로 이동한다.
- 버튼 클릭 시 지도 상의 폴리라인 show/hidden
 
---

### 2. 미션2: 마커(완료)
#### 요구사항
- node.json 파일의 데이터를 받아와 위도 경도 값을 사용하여 지도 내 marker를 표출한다.
- marker에 마우스 오버 시 json 파일의 name이 표출되도록한다.
- static/public 디렉토리 내의 marker.png로 마커 이미지를 설정한다.
- 마커 사이즈는 16*16으로 설정한다.
- Bounds 기능을 활용하여 중심좌표로 이동한다.
- 버튼 클릭 시 지도 상의 마커 show/hidden

---

### 3. 미션3: 마커 기능추가(완료)
#### 요구사항
- 마커 클릭 시 지도 내에서 해당 마커를 제거한다.

---

### 4. 미션4: 폴리라인 기능추가(완료)
#### 요구사항
- 기존 Polyline을 따라 움직이는 버스 구현
- 데이터 순서(path값 기준)에 따라 움직이는 customOverlay(버스 이미지 사용)
- 방위각을 계산하여 움직이는 방향에 맞춰 버스 이미지가 회전하도록 구현

---

### 5. 미션5: 마커 및 폴리라인 기능 추가(진행중)
#### 요구사항
- marker 기능 추가
  1. marker cluster 적용
  2. 지도를 두 번 클릭하여 새로운 선을 생성할 수 있다.
  3. 생성된 선을 드래그 하여 해당 선에 새로운 지점을 추가할 수 있다.
  4. 버튼을 클릭하면 해당 선에 존재하는 모든 지점(vertexes)를 출력한다.
  5. 생성된 선을 모두 삭제하는 버튼이 존재한다.
- polyline 기능 추가
  1. 버스 이동 토글 버튼 추가

---
