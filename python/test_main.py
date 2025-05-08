import unittest
from main import countWellFormedParenthesis

class TestCount(unittest.TestCase):
    def test_small(self):
        self.assertEqual(countWellFormedParenthesis(0), 1)
        self.assertEqual(countWellFormedParenthesis(1), 1)
        self.assertEqual(countWellFormedParenthesis(3), 5)
        self.assertEqual(countWellFormedParenthesis(5), 42)

    def test_negative(self):
        with self.assertRaises(IndexError):
            countWellFormedParenthesis(-1)

if __name__ == '__main__':
    unittest.main()