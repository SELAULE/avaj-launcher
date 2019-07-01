NAME = avaj
SOURCES = srcs/main.c srcs/path.c srcs/init.c
INCLUDES = includes/libft/libft.a includes/gnl/get_next_line.c

$(NAME):
	@echo "." > sources.txt
	@find . -name "*.java" >> sources.txt
	@javac -sourcepath @sources.txt
	@echo "\033[1;32;4mCOMPILING SUCCESSFUL"
all: $(NAME)

clean:
	@rm -R ./*/*.class ./*/*/*.class
	@rm sources.txt
	@echo "\033[1;34;4mCLEAN SUCCESSFUL\033[0m"

fclean: clean
	@rm simulation.txt
re: fclean all
