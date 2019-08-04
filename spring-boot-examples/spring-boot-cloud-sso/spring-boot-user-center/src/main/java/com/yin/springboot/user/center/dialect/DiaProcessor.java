package com.yin.springboot.user.center.dialect;

import org.springframework.context.ApplicationContext;
import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.model.IModel;
import org.thymeleaf.model.IModelFactory;
import org.thymeleaf.model.IProcessableElementTag;
import org.thymeleaf.processor.element.AbstractElementTagProcessor;
import org.thymeleaf.processor.element.IElementTagStructureHandler;
import org.thymeleaf.spring5.context.SpringContextUtils;
import org.thymeleaf.templatemode.TemplateMode;

public class DiaProcessor extends AbstractElementTagProcessor {
    private static final String TAG_NAME = "list";//标签名
    private static final int PRECEDENCE = 10000;//优先级

    public DiaProcessor(String dialectPrefix) {
        super(TemplateMode.HTML, dialectPrefix, TAG_NAME, true, null, false, PRECEDENCE);
    }

    @Override
    protected void doProcess(ITemplateContext context, IProcessableElementTag tag, IElementTagStructureHandler structureHandler) {
        ApplicationContext appCtx = SpringContextUtils.getApplicationContext(context);

        String var = tag.getAttributeValue("var");
        final IModelFactory modelFactory = context.getModelFactory();

        final IModel model = modelFactory.createModel();

        model.add(modelFactory.createOpenElementTag("div"));
        model.add(modelFactory.createText(var + "ojbk"));
        model.add(modelFactory.createCloseElementTag("div"));
        structureHandler.replaceWith(model, false);
    }
}
