#!python3

def reverse_string(sample_string):
    if len(sample_string) == 0:
        return ''
    else:
        return reverse_string(sample_string[1:]) + sample_string[0]


input_string = input("please enter the string to be reversed\n")
print(reverse_string(input_string))
