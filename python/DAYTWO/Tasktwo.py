def  get_student_score(score1, score2, score3):
	sum = score1 + score2 + score3 
average = sum /  3
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
print(get_Student_Score(average))