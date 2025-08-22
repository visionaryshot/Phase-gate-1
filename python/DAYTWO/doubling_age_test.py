import unittest
import Taskone

ClassTestdoubling_age_testFunction(unittest.Test.Case):
def test_that_doubling_age_test_Function_return_correct_result(self):
	result = doubling_age.Taskone(50-2*22)
	self.assertEqual(result,6)


def test_that_doubling_age_test_Function_raise_validation_with_incorrect(self):
	self.assertRaise(valueError,doubling_age.Taskone,"Fareed")


def test_that_doubling_age_test_Function_return_correct_result_with_decimal_value(self):
	result = doubling_age.Taskone(22.7)
	self.assertEqual(result,22.7)

def test_that_doubling_age_test_Function_return_correct_result(self):
	result = doubling_age.Taskone(50-2*22)
	self.assertNotEqual(result,6) 