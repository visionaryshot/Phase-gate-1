function getStudentScore(score1, score2, score3):
	let sum = score1 + score2 + score3 
let average = sum  /   3
if 90 <= average <=100:
	result = 'A'
elif 80 <= average <  90:
	result = 'B'
elif 70 <= average  < 80:
	result = 'C'
elif 60 <= average < 70:
	result = 'D'
else:
	result =  F