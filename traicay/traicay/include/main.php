<style type="text/css">
	.product{
		float: left;
		width: 162px;
		margin-top:20px;
		text-align: center;
		margin-left: 25px;
		margin-bottom: 30px;
	}
	.spm{
		background:url(images/mtp.png);
		height: 25px;
		color: white;
		margin-bottom: 20px;
	}
	.spm h3{
		padding: 3px;
		padding-left: 15px;
	}
/*	.item{
		background-color: #e1e1e1;
	}*/
	.chung{
		background-color: #FFFFFF;
		height: auto;
	}
	a:visited{
		color: blue;
	}
	a:hover{
		color: red;
	}

</style>

<div class="chung clearfix">
<div class="spm">
	<h3>Sản phẩm mới</h3>
</div>
				<?php
					$strSQL="SELECT * FROM qua ORDER BY ma_qua desc";
					$qua=mysqli_query($ung,$strSQL);
					while ($row=mysqli_fetch_array($qua)) {
				?>

<div class="item clearfix">				
<div class="product">
	        <div class="image">
				<a href="#" onclick="chitiet('<?php echo $row['ma_qua']; ?>')">
				    <img src="images/sp/<?php echo $row['hinh_anh']; ?>" border="0" height="103" width="120" />
				</a>
			</div>
			<div class="item">
				<div class="name_pd">Tên sản phẩm : <span class="ten"><a href="#" onclick="chitiet('<?php echo $row['ma_qua']; ?>')"><b><?php echo $row['ten_qua']; ?></b></a>												<?php
												// hien trang thai cua qua
													if($row['trang_thai']==1)
													echo "<img src='images/hot.gif' border='0'>";
												?></span>

				</div>		
				<div class="name_pd">Giá bán:<span class="ten"><a href="#" onclick="chitiet('<?php echo $row['ma_qua']; ?>')"><b><?php echo number_format($row['gia'],0,'.','.'); ?> VNĐ</b></a></span>

				</div>
				<div class="detail">
					<a href="#" onclick="chitiet('<?php echo $row['ma_qua']; ?>')">Chi Tiết </a>
					<img src="images/cart.png" border="0" width="14" height="14" align="bottom" />
					<a href="#" onclick="chonhang('<?php echo $row['ma_qua']; ?>','<?php echo $row['ten_qua']; ?>','<?php echo $row['gia']; ?>')">Đặt Mua</a>
				</div>									
										
	        </div>
</div>
<?php } ?>
</div>
</div>
			<div style="margin-bottom:20px;"><a href="#" onclick="dentrang_onsubmit('sanpham')"><img src="images/list.png" border="0" align="bottom"  height="12px"/>
			&nbsp;&nbsp;
			Xem Thêm Các Sản Phẩm Khác...</a></div>
</div>