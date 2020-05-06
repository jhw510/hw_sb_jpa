"use strict"


var lostVue = {
		list : ()=>{
			return `<table id="lostListData">
                        <tr>
                            <td>
                                <a id="number">No.</a>
                            </td>
                            <td>
                                <a id="lostId">분실물번호</a>
                            </td>
                             <td>
                                <a id="lostName">분실물 이름</a>
                            </td>
                           <td>
                                <a id="lostKind">분실물 종류</a>
                            </td>
                            <td>
                                <a id="lostAddr">분실물 위치</a>
                            </td>
                            <td>
                                <a id="lostDate">분실날짜</a>
                            </td>
                           
                        </tr>
                        
                    </table>`
		},
		lostDetail : ()=>{
			return `<div id="lostList">
			<table>
			<tr>
				<td id="title" colspan="3">분실물 정보</td>
			</tr>
			<tr>
				<td id="profile_pic" rowspan="7">
					<svg id="profile_pic_default" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24">
						<path d="M3 5v14c0 1.1.89 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2H5c-1.11 0-2 .9-2 2zm12 4c0 1.66-1.34 3-3 3s-3-1.34-3-3 1.34-3 3-3 3 1.34 3 3zm-9 8c0-2 4-3.1 6-3.1s6 1.1 6 3.1v1H6v-1z" />
						<path d="M0 0h24v24H0z" fill="none" />
					</svg>
				</td>
				<td class="userlabel">분실물번호</td>
				<td class="input">
					<p id="lostId"></p>
				</td>
			</tr>
			<tr>
				<td class="userlabel">분실물 이름</td>
				<td class="input">
					<p id="lostName"></p>
				</td>
			</tr>
			<tr>
				<td class="userlabel">분실물 종류</td>
				<td class="input">
					<p id="lostKind"></p>
				</td>
			</tr>
			<tr>
				<td class="userlabel">분실물 위치</td>
				<td class="input">
					<p id="lostAddr"></p>
				</td>
			</tr>
	
			<tr>
				<td class="userlabel">분실날짜</td>
				<td class="input">
					<p id="lostDate"></p>
				</td>
			</tr>
		</table>
	</div>`}
		}