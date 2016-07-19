/*      By XPath
        xpath(String xpathexpression) : By – It is most popular and majorly used locating element technique or the
        easiest way to locate element in WebDriver. It takes a parameter of String which is a XPATHEXPRESSION and it
        returns a BY object to findElement() method.

        Command – driver.findElement(By.xpath(“Element XPATHEXPRESSION”));

        The best thing in xpath is that it provides many different technique to locate elements. It gives you feature
        to locate single element in many ways.

        We have a complete chapter on XPath techniques which we will come across during our learning journey on ToolsQA
        latter.


        Difference between FindElement & FindElements Commands
        The difference between findElement() and findElements() method is the first returns a WebElement object
        otherwise it throws an exception and the latter returns a List of WebElements, it can return an empty list if
        no DOM elements match the query.

        findElement()

        On Zero Match : throws NoSuchElementException
        On One Match : returns WebElement
        On One+ Match : returns the first appearance in DOM
        findElements()

        On Zero Match : return an empty list
        On One Match : returns list of one WebElement only
        On One+ Match : returns list with all matching instance */