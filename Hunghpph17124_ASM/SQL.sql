CREATE DATABASE FPL_DAOTAO
GO
USE FPL_DAOTAO
GO
CREATE TABLE USERS (
	username nvarchar(50) not null primary key,
	password nvarchar(50) not null,
	role nvarchar(50) not null
);
insert into USERS(username,password,role) values
('canbodaotao','123',N'Cán bộ đào tạo'),
('giangvien','1234',N'Giảng viên');

CREATE TABLE STUDENTS(
MASV nvarchar(50) not null,
Hoten nvarchar(50) not null,
Email nvarchar(50) not null,
SoDT nvarchar(15)  null,
Gioitinh bit not null,
Diachi nvarchar(50) not null,
Hinh nvarchar(50),  
CONSTRAINT PK_STUDENTS PRIMARY KEY(MASV) 
);
insert into STUDENTS(MASV,Hoten,Email,SoDT,Gioitinh,Diachi,Hinh) values
('sv01',N'Hoàng Phi Hùng','hungfpt@gmail.com','0949325099',0,N'Nam từ liêm','Hinh01.jpg'),
('sv02',N'Hoà Quang Sỹ','syfpt@gmail.com','0949632189',1,N'Mễ trì','Hinh02.jpg'),
('sv03',N'Trần Tiến Mạnh','manhfpt@gmail.com','099847569',1,N'Hà Đông','Hinh03.jpg'),
('sv04',N'Đỗ Đức Toàn','toan@gmail.com','0911234769',0,N'Phạm văn đồng','Hinh04.jpg'),
('sv05',N'Nguyễn Minh Hiếu','hieufpt@gmail.com','0387490099',0,N'Trần duy hưng','Hinh05.jpg'),
('sv06',N'Trần Khá Bảnh','banhfpt@gmail.com','0912325099',1,N'Bắc Ninh','Hinh06.jpg'),
('sv07',N'Ngô Đại Việt','vietfpt@gmail.com','0949642189',0,N'Mễ trì','Hinh07.jpg'),
('sv08',N'Đỗ Duy Tiến','tienfpt@gmail.com','099847729',0,N'Hà Đông','Hinh08.jpg'),
('sv09',N'Trần Văn Khánh','khanhfpt@gmail.com','0911934769',1,N'Phạm văn đồng','Hinh09.jpg'),
('sv10',N'Bùi Xuân Huấn','huanfpt@gmail.com','0387422599',0,N'Trần duy hưng','Hinh10.jpg');
CREATE TABLE GRADE(
ID int IDENTITY(1,1) not null primary key,
MASV nvarchar(50) not null,
Tienganh float  null,
Tinhoc float  null,
GDTC float  null,

Constraint FK_GRADE_STUDENTS foreign key (MASV) references STUDENTS(MASV) ON DELETE CASCADE ON UPDATE CASCADE

);
insert into GRADE(MASV,Tienganh,Tinhoc,GDTC) values 
('sv01','10','8','9'),
('sv02','9','9','3'),
('sv03','8','6','5'),
('sv04','7','5','10'),
('sv05','6','10','4');
select * from GRADE
select * from STUDENTS

