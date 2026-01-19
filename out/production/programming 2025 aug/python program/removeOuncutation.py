# write a python program to remove punctuation from a given string
input_str = input("enter the the String: ")
pun = '''!"#$%^&*(){}:"|><?"'[];'.@~!'''
translator = str.maketrans('','',pun)
result = input_str.translate(translator)
print("original string: ",input_str)
print("string without punctuation : ",result)